from collections import deque

class Solution:
    def highestPeak(self, isWater: list[list[int]]) -> list[list[int]]:
        m, n = len(isWater), len(isWater[0])
        # Initialize result matrix with same dimensions as input
        matrix = [[-1] * n for _ in range(m)]

        # Queue to perform BFS
        que = deque()

        # Initialize matrix and queue
        for i in range(m):
            for j in range(n):
                if isWater[i][j] == 1:
                    # Water cells have height 0 and are added to queue
                    que.append((i, j, 0))
                    matrix[i][j] = 0

        # Possible directions: right, left, down, up
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]

        # BFS Traversal
        while que:
            r, c, height = que.popleft()

            # Check all adjacent cells
            for dr, dc in directions:
                nr, nc = r + dr, c + dc

                # If adjacent cell is within bounds and unvisited
                if 0 <= nr < m and 0 <= nc < n and matrix[nr][nc] == -1:
                    # Set height to 1 more than current cell
                    matrix[nr][nc] = height + 1
                    # Add to queue for further exploration
                    que.append((nr, nc, height + 1))

        # Return the completed height map
        return matrix