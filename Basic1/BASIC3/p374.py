# 파일 삭제하기
import os

if os.path.exists("./BASIC3/new_file.txt"):
    os.remove("./BASIC3/new_file.txt")
else:
    print("삭제하려는 파일이 없어요")



#폴더 만들기
if os.path.exists("./BASIC3/mm"):
    print("이미 폴더가 있습니다.")
else :
    os.makedirs("./BASIC3/mm")

#폴더 삭제하기
if os.path.exists("./BASIC3/mm"):
    os.rmdir("./BASIC3/mm")
else:
    print("존재하지않음")