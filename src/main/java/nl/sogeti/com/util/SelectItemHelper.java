/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: himtiwar
 ** Copyright: (c) Feb 23, 2015 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.faces.model.SelectItem;

import org.apache.commons.lang.StringEscapeUtils;

import nl.sogeti.com.domain.ReportHistory;
import nl.sogeti.com.domain.SelectList;
import nl.sogeti.com.domain.SelectListItem;

// TODO: Auto-generated Javadoc
/**
 * ????.
 * 
 * @author himtiwar (c) Feb 23, 2015, Sogeti B.V.
 * @version $Id:$
 */
public class SelectItemHelper
{

   /**
    * Convert to select item list.
    * 
    * @param selectListItem the select list item
    * @return the list
    */
   public static List<SelectItem> convertToSelectItemList(List<SelectListItem> selectListItem)
   {

      List<SelectItem> list = new ArrayList<>();

      SelectItem emptyitem = new SelectItem();
      emptyitem.setLabel("");
      list.add(emptyitem);

      for (SelectListItem selectListItemTO : selectListItem)
      {
         SelectItem selectItem = new SelectItem();
         selectItem.setLabel(StringEscapeUtils.escapeJavaScript(selectListItemTO.getOptionValue()));
         selectItem.setValue(selectListItemTO.getId());
         list.add(selectItem);
      }

      return Collections.unmodifiableList(list);
   }

   /**
    * Convert to select list.
    * 
    * @param selectList the select list
    * @return the list
    */
   public static List<SelectItem> convertToSelectList(List<SelectList> selectList)
   {

      List<SelectItem> list = new ArrayList<>();

      SelectItem emptyitem = new SelectItem();
      emptyitem.setLabel("");
      list.add(emptyitem);

      for (SelectList selectListTO : selectList)
      {
         SelectItem selectItem = new SelectItem();
         selectItem.setLabel(StringEscapeUtils.escapeJavaScript(selectListTO.getListName()));
         selectItem.setValue(selectListTO.getId());
         list.add(selectItem);
      }

      return Collections.unmodifiableList(list);
   }

   public static List<SelectItem> convertToSelectReportList(List<ReportHistory> selectList)
   {

      List<SelectItem> list = new ArrayList<>();

      for (ReportHistory selectListTO : selectList)
      {
         SelectItem selectItem = new SelectItem();
         selectItem.setLabel(StringEscapeUtils.escapeJavaScript(selectListTO.getReportName()));
         selectItem.setValue(selectListTO.getId());
         list.add(selectItem);
      }

      return Collections.unmodifiableList(list);
   }
}
