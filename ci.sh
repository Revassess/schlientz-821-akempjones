git config --global pull.rebase false
test(){
# iterate over first two tiers
    for i in 1 2
    do
        git checkout tier$i
        git pull
        cd ./Revassess/
        pass="`mvn clean test -Dtest=Tier${i}Tests`"
        exitCode="`echo $pass | grep PointsTests | grep -c FAILURE`"
      	tierPoints="`echo $pass | grep -oE '_points:[0-9]+' | grep -Eo '[0-9]+'`"
        points="`expr $points + $tierPoints`"
        mvn clean
    # if a tier failed, break and report
        if (( $exitCode > 0 ))
            then
                failedTier=$i
                break
        fi
        cd ../
    done
    # exit previous loop and check variable for if assessment failed
    if [ $exitCode -eq 0 ]
        then
            git checkout tiers3456
            git pull
            cd ./Revassess/
            for j in 3 4 5 6
            do
                    pass="`mvn test -Dtest=Tier${j}Tests`"
                    exitCode="`echo $pass | grep PointsTests | grep -c FAILURE`"
                    tierPoints="`echo $pass | grep -oE '_points:[0-9]+' | grep -Eo '[0-9]+'`"
                    points="`expr $points + $tierPoints`"
                    if (( $exitCode > 0 ))
                        then
                            failedTier=$j
                            break
                    fi
            done
        cd ../
    fi
    git checkout master
}
test
if [ $failedTier > 0 ]
then
    echo you have successfully passed "`expr $failedTier - 1`" tiers
    echo the failed tier was: tier $failedTier
    echo the total number of points are $points
    exit 100
else
    echo revassess has been passed
    echo the total number of points received is $points
fi
