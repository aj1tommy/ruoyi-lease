import request from '@/utils/request'

// 查询标签信息列表
export function listLabel(query) {
  return request({
    url: '/apartment/label/list',
    method: 'get',
    params: query
  })
}

// 查询标签信息详细
export function getLabel(id) {
  return request({
    url: '/apartment/label/' + id,
    method: 'get'
  })
}

// 新增标签信息
export function addLabel(data) {
  return request({
    url: '/apartment/label',
    method: 'post',
    data: data
  })
}

// 修改标签信息
export function updateLabel(data) {
  return request({
    url: '/apartment/label',
    method: 'put',
    data: data
  })
}

// 删除标签信息
export function delLabel(id) {
  return request({
    url: '/apartment/label/' + id,
    method: 'delete'
  })
}
