# SI_2022_lab2_203068
Амра Личина, бр. на индекс 203068

Control Flow Graph ->
Прикачена фотографија 

Цикломатска комплексност ->
Може да се открие преку бројот на региони, поточно ги гледаме предикатните јазли (во овој случај тоа се A, D, F, G.2, J, K, N, P = 8) и плус уште 1 (целиот). Вкупно 9.

Every Statement ->
Се ставаат сите node, па додаваме тестови кои ако ги поминаат statement се става *. Треба да дадаваме тестови така што ќе ги исполнат условите кои претходните тестови не ги исполниле. Со три тестови ги изминуваме сите нодови (List=null,List={0,#,0,#,#,0},List={#,0,#,0,#,#,0,0,#}).

Every Branch ->
Треба да се поминат сите гранки на nodes, пр. и ако врати true и false. Со вкупно три тестови(горе наведените) ги изминуваме сите гранки.
