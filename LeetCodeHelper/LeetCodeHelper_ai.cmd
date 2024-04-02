REM Automated LeetCode helper script by @KrunalPriyadarshi

@echo off
REM Prompt the user to enter a folder name
set /p "folderName=Enter folder name: "
set "newFolderName=Java %folderName%"

REM Set the base path
set "basePath=E:\VScode\HackerRank\LeetCode\"

REM Create a new folder at the specified path
set "fullPath=%basePath%%newFolderName%"
mkdir "%fullPath%"
cd /d "%fullPath%"

REM Generate the Solution.java file
(
  REM Java Code:
  echo class Solution ^{ 
  echo   public static void main(String^[] args^) ^{
  echo       System.out.println("Hey! Krunal."^);
  echo       System.out.println("Let's Do Today's Leetcode." + "https://leetcode.com/problemset/"^);
  echo   ^}
  echo ^}
) > Solution.java

REM Confirm Message:
echo Folder "%fullPath%" created with Solution.java file.
