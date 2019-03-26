def fibo(n):

    flist = [1,1]

    if n <= 0 : 
        return 0

    if n == 1 or n == 2:
        return n

    else :
        while n >= 3:
            temp = flist[1]
            flist[1] += flist[0]
            flist[0] = temp

            n -= 1
        return flist[1]

print(fibo(45))
