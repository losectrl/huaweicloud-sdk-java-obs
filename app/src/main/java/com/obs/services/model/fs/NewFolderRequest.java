/**
 * Copyright 2019 Huawei Technologies Co.,Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.obs.services.model.fs;

import com.obs.services.model.PutObjectBasicRequest;

/**
 * Parameters in a folder creation request
 *
 */
public class NewFolderRequest extends PutObjectBasicRequest {

    public NewFolderRequest() {
        super();
    }

    /**
     * Constructor
     * 
     * @param bucketName
     *            Bucket name
     * @param objectKey
     *            Folder name
     */
    public NewFolderRequest(String bucketName, String objectKey) {
        super();
        this.bucketName = bucketName;
        this.objectKey = objectKey;
    }

}
