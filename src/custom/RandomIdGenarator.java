/* 
 * Copyright (C) 2018
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package custom;

/**
 *
 * @author rifat
 */
public class RandomIdGenarator {
    
   public static String randomstring(int lo, int hi){
                  int n = rand(lo, hi);
                  byte b[] = new byte[n];
                  for (int i = 0; i < n; i++)
                          b[i] = (byte)rand('0', '9');
                  return new String(b, 0);
          }

          private static int rand(int lo, int hi){
                      java.util.Random rn = new java.util.Random();
                  int n = hi - lo + 1;
                  int i = rn.nextInt(n);
                  if (i < 0)
                          i = -i;
                  return lo + i;
          }
          public static String randomstring(){
                  return randomstring(5, 5);
          }
    
}
