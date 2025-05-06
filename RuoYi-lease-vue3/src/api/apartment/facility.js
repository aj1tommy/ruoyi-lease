import request from '@/utils/request'

// 查询配套信息列表
export function listFacility(query) {
  return request({
    url: '/apartment/facility/list',
    method: 'get',
    params: query
  })
}

// 查询配套信息详细
export function getFacility(id) {
  return request({
    url: '/apartment/facility/' + id,
    method: 'get'
  })
}

// 新增配套信息
export function addFacility(data) {
  return request({
    url: '/apartment/facility',
    method: 'post',
    data: data
  })
}

// 修改配套信息
export function updateFacility(data) {
  return request({
    url: '/apartment/facility',
    method: 'put',
    data: data
  })
}

// 删除配套信息
export function delFacility(id) {
  return request({
    url: '/apartment/facility/' + id,
    method: 'delete'
  })
}
