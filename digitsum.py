n=int(input("Enter a number: "))
temp=n
sum=0
while(temp!=0):
    sum+=temp%10
    temp=temp//10
print(sum)