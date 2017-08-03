/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: mkangule
 ** Copyright: (c) Apr 15, 2015 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.util;

import static nl.sogeti.com.util.CoreConstants.PROPERITY_FILENAME_PATH;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import javax.inject.Inject;
import javax.inject.Named;

import nl.sogeti.com.domain.*;


import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class MailUtils.
 * 
 * @author mkangule (c) Apr 15, 2015, Sogeti B.V.
 * @version $Id:$
 */
@Named
public final class MailUtils
{

   /** The email service. */
   @Inject
   //EmailService emailService;

   /** The Constant LOGGER. */
   private static final Logger LOGGER = LoggerFactory.getLogger(MailUtils.class);

   /**
    * Send email.
    * 
    * @param exception the exception
    * @param subject the subject
    */
   public void sendEmail(Exception exception, String subject)
   {
      Path path = Paths.get(PROPERITY_FILENAME_PATH);
      Properties properties = new Properties();
      try
      {
         properties.load(Files.newBufferedReader(path, Charset.forName("UTF-8")));
      }
      catch (IOException e)
      {
         LOGGER.error("Failed to Load Property File...!");
      }

      Attachment attachment = new Attachment("stacktrace.txt", ExceptionUtils.getStackTrace(exception).getBytes());
      StringBuilder content = new StringBuilder();

      content.append("Hello Admin, \r\n\n Error encountered while running the importer. Please find the attachment for more details.");

      sendEmail(content.toString(), subject, properties, attachment);
   }

   /**
    * Send email.
    * 
    * @param content the content
    * @param subject the subject
    * @param properties the properties
    * @param attachments the attachments
    */
   public void sendEmail(String content, String subject, Properties properties, Attachment... attachments)
   {
     // emailService.sendMessage(content, subject, properties, attachments);
   }
}
