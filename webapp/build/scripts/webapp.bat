@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%"=="" @echo off
@rem ##########################################################################
@rem
@rem  webapp startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
@rem This is normally unused
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and WEBAPP_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if %ERRORLEVEL% equ 0 goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=
set MODULE_PATH=%APP_HOME%\lib\webapp-1.0-SNAPSHOT.jar;%APP_HOME%\lib\webtemplates-1.0-SNAPSHOT.jar;%APP_HOME%\lib\helidon-webserver-static-content-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-webserver-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-http-http2-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-integrations-microstream-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-config-yaml-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-tls-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-config-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-http-media-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-http-encoding-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-http-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-media-type-4.0.0-RC1.jar;%APP_HOME%\lib\microstream-storage-embedded-configuration-08.01.01-MS-GA.jar;%APP_HOME%\lib\microstream-storage-embedded-08.01.01-MS-GA.jar;%APP_HOME%\lib\microstream-configuration-08.01.01-MS-GA.jar;%APP_HOME%\lib\microstream-persistence-binary-jdk17-08.01.01-MS-GA.jar;%APP_HOME%\lib\helidon-logging-jul-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-key-util-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-configurable-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-context-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-features-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-inject-configdriven-api-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-inject-api-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-socket-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-config-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-buffers-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-uri-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-parameters-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-mapper-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-types-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-builder-api-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-logging-common-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-security-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-task-4.0.0-RC1.jar;%APP_HOME%\lib\helidon-common-features-api-4.0.0-RC1.jar;%APP_HOME%\lib\jakarta.annotation-api-2.1.1.jar;%APP_HOME%\lib\jakarta.inject-api-2.0.1.jar;%APP_HOME%\lib\snakeyaml-2.0.jar;%APP_HOME%\lib\microstream-storage-08.01.01-MS-GA.jar;%APP_HOME%\lib\microstream-afs-nio-08.01.01-MS-GA.jar;%APP_HOME%\lib\microstream-persistence-binary-08.01.01-MS-GA.jar;%APP_HOME%\lib\microstream-persistence-08.01.01-MS-GA.jar;%APP_HOME%\lib\microstream-afs-08.01.01-MS-GA.jar;%APP_HOME%\lib\microstream-base-08.01.01-MS-GA.jar;%APP_HOME%\lib\slf4j-api-2.0.0.jar;%APP_HOME%\lib\jstachio-1.3.1.jar;%APP_HOME%\lib\jstachio-annotation-1.3.1.jar;%APP_HOME%\lib\org.eclipse.jdt.annotation-2.2.700.jar

@rem Execute webapp
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %WEBAPP_OPTS%  -classpath "%CLASSPATH%" --module-path "%MODULE_PATH%" --module com.peruncs.pcml.webapp/com.peruncs.pcml.webapp.Main %*

:end
@rem End local scope for the variables with windows NT shell
if %ERRORLEVEL% equ 0 goto mainEnd

:fail
rem Set variable WEBAPP_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
set EXIT_CODE=%ERRORLEVEL%
if %EXIT_CODE% equ 0 set EXIT_CODE=1
if not ""=="%WEBAPP_EXIT_CONSOLE%" exit %EXIT_CODE%
exit /b %EXIT_CODE%

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega