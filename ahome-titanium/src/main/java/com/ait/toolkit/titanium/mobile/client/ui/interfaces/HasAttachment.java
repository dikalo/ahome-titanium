/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.ui.interfaces;

import com.ait.toolkit.titanium.mobile.client.blob.Blob;
import com.ait.toolkit.titanium.mobile.client.filesystem.File;

public interface HasAttachment {

    /**
     * Add an attachment to the email. the attachment can either be a blob or
     * file object. note: versions before 1.7.1 will only support one attachment
     * in android. since version 1.7.1, our android implementation will accept
     * multiple attachments, but multiple attachments will only work if the user
     * chooses to send via the android gmail app; the android "mail" app (which
     * is anyway not available on some handsets) will only accept one attachment
     * from a titanium app. k9 has also been tested successfully with multiple
     * attachments.
     * 
     * @param attachment attachment object as either a Blob or File object
     */
    public void addAttachment(Blob attachment);

    /**
     * Add an attachment to the email. the attachment can either be a blob or
     * file object. note: versions before 1.7.1 will only support one attachment
     * in android. since version 1.7.1, our android implementation will accept
     * multiple attachments, but multiple attachments will only work if the user
     * chooses to send via the android gmail app; the android "mail" app (which
     * is anyway not available on some handsets) will only accept one attachment
     * from a titanium app. k9 has also been tested successfully with multiple
     * attachments.
     * 
     * @param attachment attachment object as either a Blob or File object
     */
    public void addAttachment(File attachment);

}