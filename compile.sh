echo -e  "\n.-''-..-''-..-''-..-''-..-''-..-''-..-''-.\n"

if [ "$1" == "" ]
then
    echo " +| No source file specified!."
else
    if [ -e "$1.kt" ]
    then 
        kotlinc "${1}.kt" -include-runtime -d output.jar && java -jar output.jar
    else 
        echo " +| $1.kt source file NOT found!."
    fi
fi
echo -e "\n'-..-''-..-''-..-''-..-''-..-''-..-''-..-'\n"
