/*
 * Copyright (C) 2013 www.418log.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ab.task;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * ����������ִ�еĽӿ�.
 *
 * @author zhaoqp
 * @date 2011-12-10
 * @version v1.0
 */
public abstract class AbTaskListCallback extends AbTaskCallback{

    /**
	 * ������ִ����ɺ�ص�.
	 * ���ܳɹ���񶼻�ִ��
	 * @param paramList ���ص�List
	 */
    public abstract void update(List<?> paramList);
	
}