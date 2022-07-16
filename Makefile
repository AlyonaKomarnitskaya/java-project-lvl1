rebuild:
	./gradlew clean
	./gradlew installDist

checkstyle:
	./gradlew checkstyleMain
run-dist:
	./build/install/app/bin/app
