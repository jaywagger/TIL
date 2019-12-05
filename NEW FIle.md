## Git

>  Git은 분산형 버전관리 시스템 (DVCS)이다. 한 공간이 아니고 여러 공간에.

>  소스코드혀상 관리 도구로써, 작성되는 코드의 이력을 남길 수 있다. 

## 0. 기본 설정

> 아래의 설정은 이력 자성자 (author)를 설정하는 것으로, 컴퓨터에서 최초에 한번만 설정하면 된다.
>
git config -- global 

git config -- global user.name 이름

git config -- global user.email 이메일

로 변경해라



## 1. 로컬 저장소 활용

1. 저장소 초기화

   git init

* (master)는 현재 있는 브랜치 위치를 뜻하며, .git 폴더가 생성된다.
* 해당 폴더를 삭제하게 되면 모든 git관련된 이력이 삭제된다.



2. Add

   이력을 확장하기 위해서는 add 명령어를 통하여 staging area 에 stage 시킨다.

   > git add									# 현재 디렉토리를 stage
   >
   > git add README.md			# 특정 파일ㅇ
   >
   > git add images/

add를 한 이후에는 항상 status 명령어를 통해 원하는 대로되었는지 확인한다.

student@M15016 MINGW64 ~/Desktop/TIL (master)
$ git add .

student@M15016 MINGW64 ~/Desktop/TIL (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   Git-2.24.0.2-64-bit.exe

student@M15016 MINGW64 ~/Desktop/TIL (master)



### 3. Commit

git 은 commit을 통해 이력을 남긴다. 커밋시에는 항상 메세지를 통해 해당 이력의 정보를 나타내야 한다. 

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   Git-2.24.0.2-64-bit.exe


student@M15016 MINGW64 ~/Desktop/TIL (master)
$ git commit -m Init
[master (root-commit) 1df8276] Init
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 Git-2.24.0.2-64-bit.exe

student@M15016 MINGW64 ~/Desktop/TIL (master)
$ git log
commit 1df8276fca2ac1b7f0d90bf3de5beac397e9d407 (HEAD -> master)
Author: jaywagger <sos0841@naver.com>
Date:   Thu Dec 5 16:53:10 2019 +0900

    Init
    
    커밋 목록은 아래의 명령어를 통해확인 가능하다.