// On my honor:
// - I have not used source code obtained from another current or
//   former student, or any other unauthorized source, either
//   modified or unmodified.
//
// - All source code and documentation used in my program is
//   either my original work, or was derived by me from the
//   source code published in the textbook for this course.
//
// - I have not discussed coding details about this project with
//   anyone other than my partner (in the case of a joint
//   submission), instructor, ACM/UPE tutors or the TAs assigned
//   to this course. I understand that I may discuss the concepts
//   of this program with other students, and that another student
//   may help me debug my program so long as neither of us writes
//   anything during the discussion or modifies any computer file
//   during the discussion. I have violated neither the spirit nor
//   letter of this restriction.
/**
 * The class containing the main method.
 *
 * @author Jihoo Jeong
 * @author Jaison Dasika
 * @version 9/21/23
 */
public class SemSearch
{
    /**
     * Main Method
     * 
     * @param args Command line parameters
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage: {world-size}" + "{command-file}");
            return;
        }
        double worldSize = Double.parseDouble(args[0]);
        if ((int) (Math.log(worldSize) / Math.log(2)) != (Math.log(worldSize)
                / Math.log(2))) {
            System.out.println("World size must be a power of 2 silly");
            return;
        }
        Parser.readAndProcessCommands(args[1], (int) worldSize);
    }
}