@echo off

rem Get formatted date
set DATE_FORMAT=YYYY-MM-DD
for /f "tokens=2-4 delims=/ " %%a in ("%date%") DO set TODAY=%%c-%%a-%%b

rem Construct message with argument
set MESSAGE=Daily changes on %TODAY% : "%1"

rem Git commands
git status -s
git add .
git commit -m "%MESSAGE%"
git push origin HEAD

echo Done!
