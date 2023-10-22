n1=int(input("Enter a number "))
n2=int(input("Enter a number "))
temp=n1
while n1!=0 and n2!=0:
    temp=n1%n2
    n1=n2
    n2=temp
print(n1)