def conv(num, f, t):
    n = int(num, f)
    if t == 10:
        return str(n)
    s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    r = ""
    while n > 0:
        r = s[n % t] + r
        n //= t
    return r or "0"

num = input()
f = int(input())
t = int(input())

print(conv(num, f, t))