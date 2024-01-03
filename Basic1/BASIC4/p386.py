import json

with open("member.json","r",encoding="utf-8")as f:
    dict =json.load(f)

    print(dict)
    print(dict['history'][0]['data'])
    print(dict['history'][1]['route'])

   # print(dict2[contactNumbers][0][type])
   # print(dict2[favoriteSports][0])