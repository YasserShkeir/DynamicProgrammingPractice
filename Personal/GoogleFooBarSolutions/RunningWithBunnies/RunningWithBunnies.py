# You and the bunny workers need to get out of this collapsing death trap of a space station -- and fast! Unfortunately,
#  some of the bunnies have been weakened by their long work shifts and can't run very fast. Their friends are trying to
#  help them, but this escape would go a lot faster if you also pitched in. The defensive bulkhead doors have begun to
#  close, and if you don't make it through in time, you'll be trapped! You need to grab as many bunnies as you can and
#  get through the bulkheads before they close.

# The time it takes to move from your starting point to all of the bunnies and to the bulkhead will be given to you
#  in a square matrix of integers. Each row will tell you the time it takes to get to the start, first bunny, second
#  bunny, ..., last bunny, and the bulkhead in that order. The order of the rows follows the same pattern (start,
# each bunny, bulkhead). The bunnies can jump into your arms, so picking them up is instantaneous, and arriving at
#  the bulkhead at the same time as it seals still allows for a successful, if dramatic, escape. (Don't worry, any
#  bunnies you don't pick up will be able to escape with you since they no longer have to carry the ones you did
# pick up.) You can revisit different spots if you wish, and moving to the bulkhead doesn't mean you have to
# immediately leave -- you can move to and from the bulkhead to pick up additional bunnies if time permits.

# In addition to spending time traveling between bunnies, some paths interact with the space station's security
#  checkpoints and add time back to the clock. Adding time to the clock will delay the closing of the bulkhead
#  doors, and if the time goes back up to 0 or a positive number after the doors have already closed, it triggers
#  the bulkhead to reopen. Therefore, it might be possible to walk in a circle and keep gaining time: that is,
# each time a path is traversed, the same amount of time is used or added.

# Write a function of the form solution(times, time_limit) to calculate the most bunnies you can pick up and which
# bunnies they are, while still escaping through the bulkhead before the doors close for good. If there are multiple
#  sets of bunnies of the same size, return the set of bunnies with the lowest worker IDs (as indexes) in sorted order.
#  The bunnies are represented as a sorted list by worker ID, with the first bunny being 0. There are at most 5 bunnies,
#  and time_limit is a non-negative integer that is at most 999.

import itertools


def convert_to_path(perm):
    perm = list(perm)
    perm = [0] + perm + [-1]
    path = list()
    for i in range(1, len(perm)):
        path.append((perm[i - 1], perm[i]))
    return path


def answer(time, time_limit):
    rows = len(time)
    bunnies = rows - 2

    for k in range(rows):
        for i in range(rows):
            for j in range(rows):
                if time[i][j] > time[i][k] + time[k][j]:
                    time[i][j] = time[i][k] + time[k][j]

    for r in range(rows):
        if time[r][r] < 0:
            return [i for i in range(bunnies)]

    for i in reversed(range(bunnies + 1)):
        for perm in itertools.permutations(range(1, bunnies + 1), i):
            total_time = 0
            path = convert_to_path(perm)
            for start, end in path:
                total_time += time[start][end]
            if total_time <= time_limit:
                return sorted(list(i - 1 for i in perm))
    return None


# Test cases
print(
    answer(
        [
            [0, 2, 2, 2, -1],
            [9, 0, 2, 2, -1],
            [9, 3, 0, 2, -1],
            [9, 3, 2, 0, -1],
            [9, 3, 2, 2, 0],
        ],
        1,
    )
)
