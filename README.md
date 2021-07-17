# Spring Boot 샘플 프로젝트

## 시작하며
Spring Boot를 활용한 DB CRUD 샘플과 파일 다운로드 샘플을 포함하고 있습니다.

## Overview
- 프로젝트 Checkout
- 프로젝트 실행
- DB(H2 DB) 콘솔 실행 방법
- API 테스트 방법
- 차후 개선방향

## 프로젝트 Checkout
프로젝트 다운로드 방법입니다. git을 설치 후 아래 명령어로 프로젝트를 다운로드 합니다.
`spring-sample` 디렉토리가 생성되고, 소스를 다운로드 합니다.
```shell
$ git clone git@github.com:litlhope/spring-sample.git
```

## 프로젝트 실행
프로젝트 디렉토리로 진입하여 스프링 부트를 실행 합니다.
```shell
$ cd spring-sample
$ gradlew bootRun
```

## DB(H2 DB) 콘솔 실행 방법
프로젝트 실행 후 http://localhost:8080/h2-console 접속하여 DB 콘솔에 접속 할 수 있습니다.
프로젝트는 기본 설정으로 작성되어 있으므로, 별도 설정 변경 없이 하단의 `Connect`버튼을 클릭하여 접속 할 수 있습니다.

## API 테스트 방법
1. Swagger 접속
    - http://localhost:8080/swagger-ui.html#/ 접속하여 swagger-ui를 오픈 합니다.
    
2. API 테스트
    - `board-controller`와 `file-controller`를 열어 CRUD 및 파일 다운로드 테스트 합니다.
    
## 차후 개선방향
1. 스웨거 설정 조정
    - 사용하는 API만 표기 되도록 설정 조정
    
2. DB 설정 조정
    - 실제 사용하는 DB(MariaDB, MySQL 등)으로 설정 조정
    
3. 파일 업로드 샘플 추가
4. 프로젝트에서 유용하게 사용 할 수 있는 각종 샘플 추가
