/**
 *    Copyright 2015-2020 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.spring.boot.autoconfigure;

import org.apache.ibatis.session.Configuration;

/**
 * Callback interface that can be customized a {@link Configuration} object generated on auto-configuration.
 *
 * {@link FunctionalInterface}：标注该接口是函数式接口
 * 1. 此注解表明该接口是一个函数式接口，所谓的函数式接口，是指“有且只有一个抽象方法”
 * 2. 接口中的静态方法，默认方法（default修饰），以及 java.lang.Object 类中的方法都不算抽象方法
 * 3. 如果接口符合函数式接口的定义，则此注解加不加无所谓，加了会方便编译器检查，如果不符合函数式接口定义，则此注解会报错
 *
 * @author Kazuki Shimizu
 * @since 1.2.1
 */
@FunctionalInterface
public interface ConfigurationCustomizer {

  /**
   * Customize the given a {@link Configuration} object.
   *
   * @param configuration
   *          the configuration object to customize
   */
  void customize(Configuration configuration);

}
