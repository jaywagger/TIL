## Git

>  Git은 분산형버전관리시스템 (DVCS)이다. 한 공간이 아니고 여러 공간에.

>  소스코드 형상 관리 도구로써, 작성되는 코드의 이력을 관리한다. 
>
>  장점: 협업을 위한 툴이다. 버전을 체크하는 툴이다.

## 0. 기본 설정

아래의 설정은 이력 작성자 (author)를 설정하는 것으로, 컴퓨터에서 최초에 한번만 설정하면 된다.

```bash
git config --global user.name jaywagger
git config --global user.email sos0841@naver.com
git init
git add .
git commit -m 'init'
git remote add laptop https://github.com/jaywagger/androidLogin.git
git push laptop master
```

$ git config --global user.email sos0841@naver.com

> git config -- global 

```bash

$ git config --global user.name 이름 유저이름
$ git config --global user.email 이메일
```



## 1. 로컬 저장소 (Respository) 활용

### 1. 저장소 초기화

```bash
$ git init
Initialized empty Git repository in C:/Users/student/Desktop/TIL/.git/
(master) $
```

* (master)는 현재 있는 브랜치 위치를 뜻하며, .git 폴더가 생성된다.

* 해당 폴더를 삭제하게 되면 모든 git관련된 이력이 삭제된다.



### 2. Add

이력을 확장하기 위해서는 add 명령어를 통하여 staging area 에 stage 시킨다.

``` bash
$ git add . # 현대 디렉토리를 stage
$ git add 특정파일 이름 # 특졍 파일을 stage
$ git add images/ #특정 폴도를 업로드
```



add를 한 이후에는 항상 status 명령어를 통해 원하는 대로되었는지 확인한다.

``` bash
student@M15016 MINGW64 ~/Desktop/TIL (master)
$ git add .
warning: adding embedded git repository: TIL
hint: You've added another git repository inside your current repository.
hint: Clones of the outer repository will not contain the contents of
hint: the embedded repository and will not know how to obtain it.
hint: If you meant to add a submodule, use:
hint:
hint:   git submodule add <url> TIL
hint:
hint: If you added this path by mistake, you can remove it from the
hint: index with:
hint:
hint:   git rm --cached TIL
hint:
hint: See "git help submodule" for more information.

```

### 3. Commit

git 은 commit을 통해 이력을 남긴다. 

커밋시에는 항상 메세지를 통해 해당 이력의 정보를 나타내야 한다. 

```bash
$ git commit -m 'Init'
[master (root-commit) 1df8276] Init
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 Git-2.24.0.2-64-bit.exe

student@M15016 MINGW64 ~/Desktop/TIL (master)
$ git log
commit 1df8276fca2ac1b7f0d90bf3de5beac397e9d407 (HEAD -> master)
Author: jaywagger <sos0841@naver.com>
Date:   Thu Dec 5 16:53:10 2019 +0900
```

커밋 목록은 아래의 명령어를 통해확인 가능하다.

``` bash
$ git log
commit 3249278af8db0568c6dc4b91bc7daa24af47bd89 (HEAD -> master)
Author: edutak <edutak.ssafy@gmail.com>
Date:   Thu Dec 5 16:54:01 2019 +0900

    Init
```





## 2. 원격 저장소 (Remote Respository) 활용

> 원격 저장소는 다양한 서비스를 통해 제공 받을 수 있다.
>
> github, gitlab, bitbucket

``` bash
<<<<<<< HEAD
git remote add desktop https://github.com/jaywagger/HTML.git


=======
$ git remote add origin/이름 https://github.com/jaywagger/TIL.git
>>>>>>> d538c9bec1bed09d79d78ed2b555fd219c9bab97
```

원격 저장소 (remote)를 origin/이름 이라는 이름으로 해당 url로 설정한다.

등록된 원격 저장소는 아래의 명령어로 확인할 수 있다.

origin  https://github.com/jaywagger/TIL.git (fetch)
origin  https://github.com/jaywagger/TIL.git (push)

## 2. 원격 저장소 push

``` bash
$ git push origin/이름 master
```

origin 원격 저장소에 push 하게 되어 github에서 확인할 수 있다. 

이후 작업 과정에서는 add, commit 으로 이력을 남기고 push로 업로드할 수 있다.



## 요약: 커밋하는 방법

1. status 확인: 

   ```bash
   $ git status
   ```

2. pull

``` bash
$ git pull desktop master
```



1. add 

   ``` bash
   $ git add .
   ```

2. 커밋 

   ``` bash
   $ git commit -m 'Init'
   ```

3. 푸쉬

   ```bash
   $ git push desktop master
   ```

   Github 홈페이지를 Refresh하면 업로드가 끝나 있다....



### 홈페이지에 있는 파일을 다운받기

git clone (url)

--------------------------------------------------------------------------------------------------

### 에러

1. [rejected]        master -> master (fetch first)

``` bash
student@M15014 MINGW64 /c/IoTJY/TIL (master)
$ git push origin master
To https://github.com/jaywagger/TIL.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/jaywagger/TIL.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

```

​	해결방법: 

	git pull origin master
=======
clone 방법

git clone url
>>>>>>> 
