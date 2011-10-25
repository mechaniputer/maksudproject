/*
 * iflexsc.h
 *
 *  Created on: Oct 24, 2011
 *      Author: maksud
 */

#ifndef IFLEXSC_H_
#define IFLEXSC_H_

#define sys_flexsc_register 303
#define sys_flexsc_wait 304
#define sys_flexsc_register2 305

#include <flexsc/flexsc.h>

//Explicit System Calls
struct syscall_page* flexsc_register();
void flexsc_wait();

struct syscall_page* allocate_register();

#endif /* IFLEXSC_H_ */
