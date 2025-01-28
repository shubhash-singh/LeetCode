from collections import deque

class Solution:
    def findMaxFish(self, grid):
        def bfs(grid, i, j):
            q = deque([(i, j)])
            total_fish = 0
            while q:
                r, c = q.popleft()
                if grid[r][c] == 0:
                    continue
                total_fish += grid[r][c]
                grid[r][c] = 0  # Mark cell as visited
                for dr, dc in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
                    nr, nc = r + dr, c + dc
                    if 0 <= nr < len(grid) and 0 <= nc < len(grid[0]) and grid[nr][nc] > 0:
                        q.append((nr, nc))
            return total_fish
        
        max_fish = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] > 0:  # Water cell with fish
                    max_fish = max(max_fish, bfs(grid, i, j))
        return max_fish