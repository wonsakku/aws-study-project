# Amazon Corretto 21의 경량화된 이미지(al2023 - Amazon Linux 2023) 사용
FROM amazoncorretto:21-al2023-headless

# 작업 디렉토리 설정
WORKDIR /app

# 로컬의 target 폴더에 생성된 jar 파일을 컨테이너 내부로 복사
# 빌드 전 반드시 로컬에서 ./mvnw package 를 실행해야 합니다.
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# 컨테이너 실행 포트 (기본 8080)
EXPOSE 8080

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "app.jar"]