#echo "\nPackaging project"
mvn clean package

#echo "\nExecute main"
java -cp target/StringReverse-1.0-SNAPSHOT.jar Main "big brown fox jumped over a lazy dog"