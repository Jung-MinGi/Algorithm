n=int(input())
def hanoi(a,시작,보조,목표):
  if a == 1:
    print(시작,목표)
    return 
  hanoi(a-1,시작,목표,보조)
  print(시작,목표)
  hanoi(a-1,보조,시작,목표)
print((2**n)-1)
hanoi(n,1,2,3)
      