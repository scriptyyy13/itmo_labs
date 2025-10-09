def conv(num, f, t): # ПСЖ
    n = int(num, f) # ПСЖ
    if t == 10: # ПСЖ
        return str(n) # ПСЖ
    s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ" # ПСЖ
    r = "" # ПСЖ
    while n > 0: # ПСЖ
        r = s[n % t] + r # ПСЖ
        n //= t # ПСЖ
    return r or "0" # ПСЖ
 # ПСЖ
num = input() # ПСЖ
f = int(input()) # ПСЖ
t = int(input()) # ПСЖ
 # ПСЖ
 # ПСЖ
print(conv(num, f, t)) # ПСЖ
