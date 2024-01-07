if [ "$1" == "" ]
then
    echo "No source file specified!."
else
    kotlinc "${1}.kt" -include-runtime -d output.jar && java -jar output.jar
fi