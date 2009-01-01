/*
 * Note: this file originally auto-generated by mib2c using
 *       version : 14170 $ of $
 *
 * $Id:$
 */
#ifndef WMANIFBSSSPROVISIONEDFORSFTABLE_DATA_ACCESS_H
#define WMANIFBSSSPROVISIONEDFORSFTABLE_DATA_ACCESS_H

#ifdef __cplusplus
extern          "C" {
#endif


    /*
     *********************************************************************
     * function declarations
     */

    /*
     *********************************************************************
     * Table declarations
     */
/**********************************************************************
 **********************************************************************
 ***
 *** Table wmanIfBsSsProvisionedForSfTable
 ***
 **********************************************************************
 **********************************************************************/
    /*
     * WMAN-IF-MIB::wmanIfBsSsProvisionedForSfTable is subid 2 of wmanIfBsPacketCs.
     * Its status is Current.
     * OID: .1.3.6.1.2.1.10.184.1.1.1.2, length: 12
     */


    int            
        wmanIfBsSsProvisionedForSfTable_init_data
        (wmanIfBsSsProvisionedForSfTable_registration *
         wmanIfBsSsProvisionedForSfTable_reg);


    void           
        wmanIfBsSsProvisionedForSfTable_container_init(netsnmp_container **
                                                       container_ptr_ptr);
    void           
        wmanIfBsSsProvisionedForSfTable_container_shutdown
        (netsnmp_container * container_ptr);

    int            
        wmanIfBsSsProvisionedForSfTable_container_load(netsnmp_container *
                                                       container);
    void           
        wmanIfBsSsProvisionedForSfTable_container_free(netsnmp_container *
                                                       container);

    int            
        wmanIfBsSsProvisionedForSfTable_row_prep
        (wmanIfBsSsProvisionedForSfTable_rowreq_ctx * rowreq_ctx);

    int            
        wmanIfBsSsProvisionedForSfTable_validate_index
        (wmanIfBsSsProvisionedForSfTable_registration *
         wmanIfBsSsProvisionedForSfTable_reg,
         wmanIfBsSsProvisionedForSfTable_rowreq_ctx * rowreq_ctx);
    int             wmanIfBsSsProvMacAddress_check_index(wmanIfBsSsProvisionedForSfTable_rowreq_ctx * rowreq_ctx);      /* internal */
    int             wmanIfBsProvSfId_check_index(wmanIfBsSsProvisionedForSfTable_rowreq_ctx * rowreq_ctx);      /* internal */


#ifdef __cplusplus
}
#endif
#endif                          /* WMANIFBSSSPROVISIONEDFORSFTABLE_DATA_ACCESS_H */
