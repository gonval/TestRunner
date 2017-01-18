# run.sh
#!/bin/sh
==============================================================================================
GITHUB_ACCOUNT=gonval
WS_DIR=/Users/val/Documents/workspace
REPO_NAME=Title_Validation_E2E
APP_VERSION=1.1
MAIN_CLASS=core.Selenium
ARGS_01=
# ============================================================================================
if ! which java >/dev/null 2>&1 ; then echo Java not installed; return; fi
if ! which mvn >/dev/null 2>&1 ; then echo Maven not installed; return; fi
if ! which git >/dev/null 2>&1 ; then echo Git not installed; return; fi
if [ -d /Users/val/ ] ; then cd ~/; else echo  directory is not exist; return; fi
if [ -d /Users/val// ]; then rm -rf /Users/val//; fi
git clone https://github.com//.git
cd ./
mvn clean site -Dtest=AllTests -Dbuild.version=1.1
echo Executing Java programm ...
java -cp /Users/val///target/-.jar  
