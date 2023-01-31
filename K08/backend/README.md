Run in the terminal: 'docker run --name postgres-db -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres'

Set GRADLE JDK to 18: Setting -> nach Gradle suchen -> Bei SDK Java 18 auswählen

Project Structure -> Bei SDK Java 18 auswählen -> Language Level auf Java Default setzen

Im Template hatte bis auf ein paar Änderungen der security der "core" folder bereits existiert.
Ich habe die antMatchers im core/security/WebSecurityConfig angepasst.
Auch hatte es bereits ein vereinfachten User-Service.