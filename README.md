# TIL (Today I Learend)

>  매일 배운 내용을 정리합니다.

## 1. git

* [git 기초](./git.md)
* [마크다운 활용](./markdown.md)

```bash
student@M50426 MINGW64 ~/Desktop/집
$ git clone https://github.com/angelarwa/TIL.git
Cloning into 'TIL'...
remote: Enumerating objects: 6, done.
remote: Counting objects: 100% (6/6), done.
remote: Compressing objects: 100% (5/5), done.
remote: Total 6 (delta 0), reused 6 (delta 0), pack-reused 0
Unpacking objects: 100% (6/6), done.

student@M50426 MINGW64 ~/Desktop/집
$ cd TIL/

student@M50426 MINGW64 ~/Desktop/집/TIL (master)
$ git log
commit 17624e5f5052e025ff842e8c251c32e1f0f0f441 (HEAD -> master, origin/master, origin/HEAD)
Author: angelarwa <eoeo1314@gmail.com>
Date:   Thu Dec 26 14:37:26 2019 +0900

    마크다운 및 정리

student@M50426 MINGW64 ~/Desktop/집/TIL (master)
$ git status
On branch master
Your branch is up to date with 'origin/master'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        README.md

nothing added to commit but untracked files present (use "git add" to track)

student@M50426 MINGW64 ~/Desktop/집/TIL (master)
$ git add .

student@M50426 MINGW64 ~/Desktop/집/TIL (master)
$ git commit -m 'Add README.md'
[master 4be95f2] Add README.md
 1 file changed, 8 insertions(+)
 create mode 100644 README.md

student@M50426 MINGW64 ~/Desktop/집/TIL (master)
$ git push origin master
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 12 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 479 bytes | 479.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/angelarwa/TIL.git
   17624e5..4be95f2  master -> master
```

```bash
$ git pull origin master
#init-clone
#push-pull
```

