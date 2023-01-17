<?

class Solution
{
    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */
    function twoSum($nums, $target)
    {
        $check = [];

        foreach ($nums as $index => $a) {
            $b = $target - $a;

            if (array_key_exists($b, $check)) {
                return [$check[$b], $index];
            }
            $check[$a] = $index;
        }

        return [];
    }
}

?>