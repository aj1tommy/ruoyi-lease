import request from '@/utils/request'

// 查询租期列表
export function listTerm(query) {
  return request({
    url: '/apartment/term/list',
    method: 'get',
    params: query
  })
}

// 查询租期详细
export function getTerm(id) {
  return request({
    url: '/apartment/term/' + id,
    method: 'get'
  })
}

// 新增租期
export function addTerm(data) {
  return request({
    url: '/apartment/term',
    method: 'post',
    data: data
  })
}

// 修改租期
export function updateTerm(data) {
  return request({
    url: '/apartment/term',
    method: 'put',
    data: data
  })
}

// 删除租期
export function delTerm(id) {
  return request({
    url: '/apartment/term/' + id,
    method: 'delete'
  })
}
