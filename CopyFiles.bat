@echo off
set SolutionDir=F:\code\java\spring-mvc-store\src\main\webapp\
set ProjectDir=F:\code\java\spring-mvc-store\target\spring-mvc-store-1.0-SNAPSHOT\
set ProjectDir2=F:\code\java\spring-mvc-store\
xcopy "%SolutionDir%static" "%ProjectDir%static" /E /Y /D
REM xcopy "%SolutionDir%static\css" "%ProjectDir2%static\css" /E /Y /D
REM xcopy "%SolutionDir%static\js\core" "%ProjectDir2%static\js\core" /E /Y /D
REM xcopy "%SolutionDir%static\js\utils" "%ProjectDir2%static\js\utils" /E /Y /D
REM xcopy "%SolutionDir%static\templates" "%ProjectDir2%static\templates" /E /Y /D
REM https://technet.microsoft.com/es-es/library/cc771254(v=ws.10).aspx