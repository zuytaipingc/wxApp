/**
 * 
 * @returns promise  getSetting
 */

export const getSetting = () => {
    return new Promise((resolve, reject) => {
        wx.getSetting({
            success: (result) => {
                resolve(result)
            },
            fail: (err) => {
                reject(err);
            }

        });
    })
}
/**
 * 
 * @returns promise  chooseAddress
 */

export const chooseAddress = () => {
    return new Promise((resolve, reject) => {
        wx.chooseAddress({
            success: (result) => {
                resolve(result)
            },
            fail: (err) => {
                reject(err);
            }

        });
    })
}

/**
 * 
 * @returns promise  openSetting
 */

export const openSetting = () => {
    return new Promise((resolve, reject) => {
        wx.openSetting({
            success: (result) => {
                resolve(result)
            },
            fail: (err) => {
                reject(err);
            }

        });
    })
}
/**
 * 
 * @param {object} param0 参数 
 * @returns 
 */

export const showModal = (content) => {
    return new Promise((resolve, reject) => {
        wx.showModal({
            title: '提示',
            content: 'content',
            success: (res) => {
                resolve(res);
            },
            fail:(err) =>{
                reject(err);
            }
        })


    })
}
/**
 * promise 形式 showToast
 * @param {object} param0 参数 
 * @returns 
 */

export const showToast = ({title}) => {
    return new Promise((resolve, reject) => {
        wx.showToast({
            title: title,
            icon: 'none',
            success: (res) => {
                resolve(res);
            },
            fail:(err) =>{
                reject(err);
            }
        })


    })
}