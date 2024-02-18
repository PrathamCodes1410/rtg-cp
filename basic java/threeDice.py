li = []
for x in range(1,7):
    for y in range(x, 7):
        for z in range(y, 7):
            # converting tuple to list
            t=()
            l = list(t)
            #print(l)
            #print(type(l))

            # appending the element in a list
            l.append(x)
            l.append(y)
            l.append(z)
            #print(l)

            # Converting the list to tuple using tuple()
            t=tuple(l)
            #print(t)
            li.append(t)

print(li)