'''
�������� ���������, ������� ����� ��������� � �������������� ���� �����������. ��������� ��������� �� ���� ��� ������ ���������� �����, 
�� ������ ������ �������� ������� ��������� ��������, �� ������ ������ � ������� ��������� ��������, ����� ���� ��� ������, �������
 ����� ����������� ���������� ������, � ��� ���� ������, ������� ����� ������������.

�����, ��������, �� ���� ��������� ��������:
abcd
*d%#
abacabadaba
#*%*d*%


��� ������, ��� ������ a ��������� ��������� ���������� �� ������ * � �����, b ���������� �� d, c � �� % � d � �� #.
����� ����������� ������ abacabadaba � ������������ ������ #*%*d*% � ������� ����� �����. �������� ��������� ������,
 ������� � ������� �� ����� ���������:
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