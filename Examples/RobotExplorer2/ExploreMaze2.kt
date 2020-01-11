// RobotExplorer2/ExploreMaze2.kt
package robotexplorer2

val stringMaze = """
a_...#..._c
R_...#...__
###########
a_......._b
###########
!_c_....._b
""".trim()

val solution = """
eeeenwwww
eeeeeeeeee
wwwwwwww
eeennnwwwwwsseeeeeen
ww
""".trim()

fun main() {
  Stage(stringMaze).run(solution)
}