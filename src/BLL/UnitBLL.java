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
package BLL;

import DAL.Unit;
import Getway.UnitGetway;

/**
 * Created by rifat on 8/15/15.
 */
public class UnitBLL {
    
    UnitGetway unitGetway = new UnitGetway();
    
    public Object save(Unit unit){
        if(unitGetway.isUniqName(unit)){
            unitGetway.save(unit);
        }
        return unit;
    }

    public Object delete(Unit unit){
        if(unitGetway.isNotUse(unit)){
            unitGetway.delete(unit);
        }
        return unit;
    }
}
