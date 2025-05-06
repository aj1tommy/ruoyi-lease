import request from '@/utils/request'

// 查询支付方式列表
export function listPaymenttype(query) {
  return request({
    url: '/apartment/paymenttype/list',
    method: 'get',
    params: query
  })
}

// 查询支付方式详细
export function getPaymenttype(id) {
  return request({
    url: '/apartment/paymenttype/' + id,
    method: 'get'
  })
}

// 新增支付方式
export function addPaymenttype(data) {
  return request({
    url: '/apartment/paymenttype',
    method: 'post',
    data: data
  })
}

// 修改支付方式
export function updatePaymenttype(data) {
  return request({
    url: '/apartment/paymenttype',
    method: 'put',
    data: data
  })
}

// 删除支付方式
export function delPaymenttype(id) {
  return request({
    url: '/apartment/paymenttype/' + id,
    method: 'delete'
  })
}
