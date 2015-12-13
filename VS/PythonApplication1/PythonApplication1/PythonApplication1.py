'''
Напишите программу, которая умеет шифровать и расшифровывать шифр подстановки. Программа принимает на вход две строки одинаковой длины, 
на первой строке записаны символы исходного алфавита, на второй строке — символы конечного алфавита, после чего идёт строка, которую
 нужно зашифровать переданным ключом, и ещё одна строка, которую нужно расшифровать.

Пусть, например, на вход программе передано:
abcd
*d%#
abacabadaba
#*%*d*%


Это значит, что символ a исходного сообщения заменяется на символ * в шифре, b заменяется на d, c — на % и d — на #.
Нужно зашифровать строку abacabadaba и расшифровать строку #*%*d*% с помощью этого шифра. Получаем следующие строки,
 которые и передаём на вывод программы:
*d*%*d*#*d*
dacabac

Sample Input 1: 
abcd
*d%#
abacabadaba
#*%*d*%

Sample Output 1: 
*d*%*d*#*d*
dacabac
'''
chrf = []
tbl = {}
count_games = int(input())
for i in range(count_games):
    st = input().strip().split(';')
    chrf.append(st)
for i in chrf:
    #if not i[0] in tbl.keys():
    #   tbl[i[0]] = [0, 0, 0, 0, 0]
    tbl.setdefault(i[0], [0,0,0,0,0])
    #if not i[2] in tbl.keys():
    #    tbl[i[2]] = [0, 0, 0, 0, 0]
    tbl.setdefault(i[2], [0,0,0,0,0])
for comm in chrf:
    if int(comm[1]) > int(comm[3]):
        tbl[comm[0]][1] += 1
        tbl[comm[2]][3] += 1
    if int(comm[1]) == int(comm[3]):
        tbl[comm[0]][2] += 1
        tbl[comm[2]][2] += 1
    if int(comm[1]) < int(comm[3]):
        tbl[comm[0]][3] += 1
        tbl[comm[2]][1] += 1
    tbl[comm[0]][0] += 1
    tbl[comm[2]][0] += 1
    tbl[comm[0]][4] = 3*tbl[comm[0]][1] + tbl[comm[0]][2]
    tbl[comm[2]][4] = 3*tbl[comm[2]][1] + tbl[comm[2]][2]
for key, value in tbl.items():
    print('{0}:{1}'.format(key, ' '.join([str(i) for i in value])))