package ch.heigvd.res.lab01.impl;

import java.util.logging.Logger;

/**
 *
 * @author Olivier Liechti
 * @author GuillaumeBlanco
 */
public class Utils {

  private static final Logger LOG = Logger.getLogger(Utils.class.getName());

  /**
   * This method looks for the next new line separators (\r, \n, \r\n) to extract
   * the next line in the string passed in arguments. 
   * 
   * @param lines a string that may contain 0, 1 or more lines
   * @return an array with 2 elements; the first element is the next line with
   * the line separator, the second element is the remaining text. If the argument does not
   * contain any line separator, then the first element is an empty string.
   */
  public static String[] getNextLine(String lines) {
    String[] arrayOfLines = {"",""};
    final int indexOfBSlashN = lines.indexOf('\n');
    final int indexOfBSlashR = lines.indexOf('\r');

    if(!lines.isEmpty()){ // if line is empty we do nothing
       if(indexOfBSlashN >= 0) { // It's like '\n' exist
         arrayOfLines[0] = lines.substring(0, indexOfBSlashN + 1);
         arrayOfLines[1] = lines.substring(indexOfBSlashN + 1);
       }else if(indexOfBSlashR >= 0){ //It's like '\r' exist
         arrayOfLines[0] = lines.substring(0, indexOfBSlashR + 1);
         arrayOfLines[1] = lines.substring(indexOfBSlashR + 1);
       }else {
         arrayOfLines[1] = lines;
       }
    }
    return arrayOfLines;
  }

}
