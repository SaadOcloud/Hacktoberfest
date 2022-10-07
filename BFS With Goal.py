Graph = {
    '5': ['3', '7'],
    '3': ['2', '4'],
    '7': ['8'],
    '2': [],
    '4': ['8'],
    '8': [],
}

Visited = []
Real = []
Found = False
Goal = '4'


def BFS(Graph, Node, Real, Goal):
    global Found

    if (Node == Goal):
        Found = True
        return
    Real.append(Node)

    for Cursor in Graph[Node]:
        Visited.append(Cursor)
    for Cur in Visited:
        Visited.pop(0)

        if (Found == False):
            BFS(Graph, Cur, Real,Goal)


BFS(Graph, '5', Real, Goal)
print(Real)
