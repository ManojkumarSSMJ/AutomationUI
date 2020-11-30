set projectlocation=E:\OpenBankingWeb\OpenBankingWeb_UI

cd %projectlocation%

set classpath=%projectlocation%\target\classes;%projectlocation%\lib*

java org.testng.TestNG %projectlocation%\Test.xml

pause
