n=int(input())
def star(a):
  if a == 3 :
    return ['***','* *','***']

  arr=star(a//3)
  star_list=[]

  for i in arr:
    star_list.append(i*3)

  for i in arr:
    star_list.append(i+' '*(a//3)+i)

  for i in arr:
    star_list.append(i*3)
  return star_list
  

for i in star(n):
  print(i)