/*
 * Note: this file originally auto-generated by mib2c using
 *  : generic-table-oids.m2c,v 1.14 2005/09/27 15:56:08 rstory Exp $
 *
 * $Id:$
 */
#ifndef IFTABLE_OIDS_H
#define IFTABLE_OIDS_H

#ifdef __cplusplus
extern          "C" {
#endif


    /*
     * column number definitions for table ifTable 
     */
#define IFTABLE_OID              1,3,6,1,2,1,2,2

#define COLUMN_IFINDEX         1

#define COLUMN_IFDESCR         2

#define COLUMN_IFTYPE         3

#define COLUMN_IFMTU         4

#define COLUMN_IFSPEED         5

#define COLUMN_IFPHYSADDRESS         6

#define COLUMN_IFADMINSTATUS         7
#define COLUMN_IFADMINSTATUS_FLAG    (0x1 << 6)

#define COLUMN_IFOPERSTATUS         8

#define COLUMN_IFLASTCHANGE         9

#define COLUMN_IFINOCTETS         10

#define COLUMN_IFINUCASTPKTS         11

#define COLUMN_IFINNUCASTPKTS         12

#define COLUMN_IFINDISCARDS         13

#define COLUMN_IFINERRORS         14

#define COLUMN_IFINUNKNOWNPROTOS         15

#define COLUMN_IFOUTOCTETS         16

#define COLUMN_IFOUTUCASTPKTS         17

#define COLUMN_IFOUTNUCASTPKTS         18

#define COLUMN_IFOUTDISCARDS         19

#define COLUMN_IFOUTERRORS         20

#define COLUMN_IFOUTQLEN         21

#define COLUMN_IFSPECIFIC         22


#define IFTABLE_MIN_COL   COLUMN_IFINDEX
#define IFTABLE_MAX_COL   COLUMN_IFSPECIFIC


    /*
     * TODO:405:r: Review IFTABLE_SETTABLE_COLS macro.
     * OR together all the writable cols.
     */
#define IFTABLE_SETTABLE_COLS (COLUMN_IFADMINSTATUS_FLAG)

#ifdef __cplusplus
}
#endif
#endif                          /* IFTABLE_OIDS_H */
